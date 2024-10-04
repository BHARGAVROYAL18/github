import pyttsx3
import datetime
import speech_recognition as sr
import wikipedia
import openai

# Initialize the text-to-speech engine
engine = pyttsx3.init()

# Set up OpenAI API Key
openai.api_key = 'your-api-key-here'  # Replace with your OpenAI API key

def speak(audio):
    """Converts text to audio."""
    engine.say(audio)
    engine.runAndWait()

def time():
    """Tells the current time."""
    current_time = datetime.datetime.now().strftime("%I:%M:%S")
    speak("The current time is " + current_time)

def date():
    """Tells the current date."""
    year = int(datetime.datetime.now().year)
    month = int(datetime.datetime.now().month)
    day = int(datetime.datetime.now().day)
    speak(f"Today's date is {day} {month} {year}")

def wishMe():
    """Greets the user based on the time of day."""
    speak("Welcome back, sir!")
    hour = datetime.datetime.now().hour
    if hour >= 0 and hour < 6:
        speak("It's late at night, you should sleep now.")
    elif hour >= 6 and hour < 12:
        speak("Good morning, sir!")
    elif hour >= 12 and hour < 15:
        speak("Good afternoon, sir!")
    else:
        speak("Good evening!")

    speak("I am Jarvis! Please tell me how I can help you!")

def takeCommand():
    """Listens to the user's voice command and returns it as text."""
    r = sr.Recognizer()
    with sr.Microphone() as source:
        print("Listening...")
        r.pause_threshold = 1
        audio = r.listen(source)

    try:
        print("Recognizing...")
        query = r.recognize_google(audio, language='en-in')
        print("You said:", query)
    except Exception as e:
        print(e)
        speak("Could you say that again, please?")
        return "None"
    
    return query

def get_chatgpt_response(prompt):
    """Fetches a response from OpenAI's ChatGPT using the newer chat model."""
    try:
        response = openai.ChatCompletion.create(
            model="gpt-3.5-turbo",  # Use gpt-4 if you have access
            messages=[{"role": "system", "content": "You are a helpful assistant."},
                      {"role": "user", "content": prompt}],
            max_tokens=150,
            n=1,
            stop=None,
            temperature=0.7,
        )
        message = response['choices'][0]['message']['content']
        return message
    except Exception as e:
        print(f"Error fetching response from ChatGPT: {e}")
        speak("Sorry, I couldn't connect to the service.")
        return None

if __name__ == "__main__":
    wishMe()
    
    while True:
        query = takeCommand().lower()

        if 'time' in query:
            time()
        elif 'date' in query:
            date()
        elif 'you can sleep' in query:
            speak("Ok sir! Thank you.")
            quit()
        
        elif 'hello jarvis' in query or 'hey jarvis' in query or 'hi jarvis' in query:
            wishMe()

        elif 'wikipedia' in query:
            speak('Searching Wikipedia...')
            query = query.replace("wikipedia", "")
            results = wikipedia.summary(query, sentences=2)
            speak("According to Wikipedia")
            speak(results)
        
        
