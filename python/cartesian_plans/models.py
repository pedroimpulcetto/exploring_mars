from django.db import models


class CartesianPlans(models.Model):
    id_cartesian_plan = models.AutoField(primary_key=True, unique=True)
    axis_x = models.IntegerField(blank=False, null=False)
    axis_y = models.IntegerField(blank=False, null=False)

    class Meta:
        managed = True
        db_table = 'cartesian_plans'
