.PHONY: test

run:
	pipenv run python play.py

test:
	pipenv run python -m pytest -o markers=task --tb=short play_test.py

build:
	pipenv install
