# python imports
# django imports
from django.http import Http404
from django.http import HttpResponse

# third imports
from rest_framework import viewsets, response, status, generics
from rest_framework.decorators import action
from rest_framework.response import Response

# my imports
from probes import models
from probes.api import serializers


class ProbesViewSet(viewsets.ModelViewSet):
    serializer_class = serializers.ProbesSerializer
    queryset = models.Probes.objects.all()
