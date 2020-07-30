# Explorgin Mars

Passo a passo para executar o projeto:

1. Crie uma venv

- python3 -m venv venv

2. Instale o requirements.txt que encontra-se na raiz do projeto

- pip install -r requirements.txt

  2.1 Crie o banco de dados e as tabelas

- python manage.py makemigrations
- python manage.py migrate

3. Inicie o server
   python manage.py runserver

4. Acesse http://127.0.0.1:8000/

5. Na rota /cartesian_plan/ adicionar o Eixo X e Eixo Y, coordenada do ponto superior-direito da malha do planalto
6. Na rota /probes/ crie um Sonda Lunar com os atributos:

- Eixo X inicial
- Eixo Y inicial
- Direção inicial
- Id do plano cartesiado que deseja usar
  OBS: 'local' é o local fical que a sonda chegará após as instruções que serão passadas

7. Na rota /instructions/ coloque as instruções que queira que sonda siga

cartesian_plan = {
"id_cartesian_plan": int,
"axis_x": int,
"axis_y": int
}

probes = {
"id_probe": int,
"init_x": int,
"init_y": int,
"direction": str,
"instructions": list()
"id_cartesian_plan": int
}

instructions = {
"id_instruction": int,
"instruction": str,
"id_probe": int
}
