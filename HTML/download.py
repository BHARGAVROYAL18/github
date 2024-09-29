from pytube import YouTube

# Prompt the user for the YouTube video URL
video_url = input('Enter the YouTube video URL: ')

yt = YouTube(video_url)
print(f'Title: {yt.title}')
print('Downloading...')

# Get the highest resolution stream available
stream = yt.streams.filter(res="1080p").first() # removed .download() here
stream.download('.')  # Downloads to the current directory

print('Download completed!')
https://youtu.be/Wd9KAp3-wZE?si=aGZxeMHQHNMHgJDO