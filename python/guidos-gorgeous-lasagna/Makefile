.PHONY: test

test:
	pipenv run python -m pytest -o markers=task --tb=short lasagna_test.py


run:
	pipenv run python main.py

deploy:
	exercism submit lasagna.py

build:
	pipenv install
