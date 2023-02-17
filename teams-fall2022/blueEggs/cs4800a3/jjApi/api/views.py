from django.http import HttpResponse

def getData(request):
    return HttpResponse("Jason Jones's says hello WWW")