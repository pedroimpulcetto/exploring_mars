from django.db import models

from cartesian_plans.models import CartesianPlans


class Probes(models.Model):

    DIRECTIONS = (
        ('N', 'N'),
        ('S', 'S'),
        ('W', 'W'),
        ('E', 'E'),
    )

    id_probe = models.AutoField(primary_key=True, unique=True)
    init_x = models.IntegerField(blank=False, null=False)
    init_y = models.IntegerField(blank=False, null=False)
    direction = models.CharField(
        choices=DIRECTIONS, max_length=1, blank=False, null=False)
    id_cartesian_plan = models.ForeignKey(
        CartesianPlans, on_delete=models.CASCADE, to_field='id_cartesian_plan')

    class Meta:
        managed = True
        db_table = 'probes'
