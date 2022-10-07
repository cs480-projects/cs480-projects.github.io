from django.http import HttpResponse
from django.shortcuts import render

def getData(request):
    return HttpResponse("Hello There!")

