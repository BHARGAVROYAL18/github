import openai

# Set up your OpenAI API key
openai.api_key = 'sk-your-correct-api-key-here'  # Replace with your actual API key

# Example of a simple request to ChatGPT
def get_chatgpt_response(prompt):
    response = openai.ChatCompletion.create(
        model="gpt-3.5-turbo",
        messages=[{"role": "system", "content": "You are a helpful assistant."},
                  {"role": "user", "content": prompt}],
        max_tokens=150,
        temperature=0.7,
    )
    return response['choices'][0]['message']['content']

# Test the API with a prompt
prompt = "Who won the 2024 FIFA World Cup?"
response = get_chatgpt_response(prompt)
print(response)
