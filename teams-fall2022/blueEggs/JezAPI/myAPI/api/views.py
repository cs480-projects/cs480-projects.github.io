from django.http import HttpResponse
import random
def getData(request):
    myNum = random.randint(1,100)
    return HttpResponse("Jezreel Salinas " + str(myNum))