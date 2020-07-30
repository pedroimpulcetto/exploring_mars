# django library
# third library
from rest_framework import serializers

# my library
from instructions import models


class InstructionsSerializer(serializers.ModelSerializer):
    class Meta:
        model = models.Instructions
        fields = '__all__'
