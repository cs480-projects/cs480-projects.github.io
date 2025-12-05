from django.shortcuts import render
from django.http import HttpResponse

def home(request):
    return HttpResponse("Welcome to our home page!<br/>We hope you can find some good recipes.")