#importing pyshorteners module
import pyshorteners

#Taking url input
url = input('Enter The URL to shorten')

#Shortening URL with the pyshorteners module 
shorturl = pyshorteners.Shortener().tinyurl.short(url)

#Printing the short url
print('Shortened URL: ', shorturl)