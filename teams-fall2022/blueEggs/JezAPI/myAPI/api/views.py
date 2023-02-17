from django.http import HttpResponse
from django.shortcuts import render
import random
def getData(request):
    return render(request, 'myName/myName.html')