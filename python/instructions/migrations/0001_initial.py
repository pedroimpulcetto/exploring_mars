# Generated by Django 3.0.8 on 2020-07-29 23:09

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    initial = True

    dependencies = [
        ('probes', '__first__'),
    ]

    operations = [
        migrations.CreateModel(
            name='Instructions',
            fields=[
                ('id_instruction', models.AutoField(primary_key=True, serialize=False, unique=True)),
                ('instruct', models.CharField(choices=[('M', 'Move'), ('R', 'Right'), ('L', 'Left')], max_length=1)),
                ('id_probe', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='probes.Probes')),
            ],
            options={
                'db_table': 'instructions',
                'managed': True,
            },
        ),
    ]
