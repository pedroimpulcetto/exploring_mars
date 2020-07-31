# python imports
# django imports
from django.http import Http404
from django.http import HttpResponse

# third imports
from rest_framework import viewsets, response, status, generics
from rest_framework.decorators import action
from rest_framework.response import Response

# my imports
from cartesian_plans import models
from cartesian_plans.api import serializers


class CartesianPlansViewSet(viewsets.ModelViewSet):
    serializer_class = serializers.CartesianPlansSerializer
    queryset = models.CartesianPlans.objects.all()
