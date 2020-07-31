# django library

# third library
from rest_framework import serializers

# my library
from cartesian_plans import models


class CartesianPlansSerializer(serializers.ModelSerializer):

    class Meta:
        model = models.CartesianPlans
        fields = '__all__'
