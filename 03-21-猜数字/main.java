import urllib.request
url='http://ip.sxisa.com'
wp=urllib.request.urlopen(url)
print(wp.read())