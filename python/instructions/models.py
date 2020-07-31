from django.db import models

from probes.models import Probes


class Instructions(models.Model):

    INSTRUCTIONS = [
        ('M', 'Move'),
        ('R', 'Right'),
        ('L', 'Left'),
    ]

    id_instruction = models.AutoField(primary_key=True, unique=True)
    instruction = models.CharField(
        choices=INSTRUCTIONS, max_length=1, blank=False, null=False)
    id_probe = models.ForeignKey(
        Probes, related_name='instructions', on_delete=models.CASCADE)

    class Meta:
        managed = True
        db_table = 'instructions'
