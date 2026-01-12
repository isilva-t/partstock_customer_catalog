all:
	mvn compile

logs:
	cd .. && docker compose logs -f backend

reload:
	@echo "🔄 Recompiling and restarting..."
	cd .. && docker compose exec backend mvn compile
	@echo "✅ Done!"

restart:
	cd .. && docker compose restart backend
	@echo "✅ Backend restarted"

status:
	cd .. && docker compose ps backend
