import requests
import os

heroku_url = 'https://indoorlocationapp.herokuapp.com/notify'
local_url = 'http://127.0.0.1:8080/notify'

def publish(username,uuid,position):
    print('Publishing new message')
    payload = {'username': username,'UUID':uuid,'position':position}
    print('HERE WE ARE ')
    response = requests.post(local_url,
                  json={
                      'topic': 'onLocationUpdate',
                      'args': [payload]
                  })
    print(response.elapsed.total_seconds())