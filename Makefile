all:
	docker compose --profile development up -d

clean:
	docker compose down

prod:
	docker compose up -d

co:
	@echo "🔄 Recompiling and restarting..."
	docker compose exec backend-dev mvn compile

blogs:
	docker compose logs -f backend
