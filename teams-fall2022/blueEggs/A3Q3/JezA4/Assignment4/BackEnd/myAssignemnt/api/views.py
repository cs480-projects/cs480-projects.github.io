from django.http import HttpResponse
from django.http import JsonResponse
from django.shortcuts import render

def getData(request):
    data = [
        {
            'firstName' : 'Jezreel',
            'lastName' : 'Salinas'
        },
    ]
    return JsonResponse(data, safe = False)

