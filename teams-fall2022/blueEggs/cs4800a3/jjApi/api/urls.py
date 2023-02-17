import imp
from multiprocessing.spawn import import_main_path
from django.urls import path
from . import views

urlpatterns = [
    path('myName/', views.getData)
]
