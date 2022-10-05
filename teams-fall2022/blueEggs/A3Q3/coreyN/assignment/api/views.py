from django.http import HttpResponse

def getInfo(request):
    return HttpResponse("Corey Nambu")