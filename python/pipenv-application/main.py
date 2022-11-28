import requests

response  = requests.get('https://httpbin.org/ip')

print('your IP is {0}'.format(response.json()['origin']))