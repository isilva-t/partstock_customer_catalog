all:
	docker compose --profile dev up -d

clean:
	docker compose down

prod:
	docker compose up -d
