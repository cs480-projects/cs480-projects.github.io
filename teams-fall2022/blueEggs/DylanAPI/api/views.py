from django.http import HttpResponse

def getData(request):
    return HttpResponse("Heyo, Dylan here... is this thing on?")