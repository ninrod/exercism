CFLAGS  = -std=c99
CFLAGS += -g
CFLAGS += -Wall
CFLAGS += -Wextra
CFLAGS += -pedantic
CFLAGS += -Werror

VFLAGS  = --quiet
VFLAGS += --show-leak-kinds=all
VFLAGS += --tool=memcheck
VFLAGS += --leak-check=full
VFLAGS += --error-exitcode=1
VFLAGS += --track-origins=yes
VFLAGS += --verbose
VFLAGS += --log-file=valgrind-out.log

test: tests.out
	@./tests.out

memcheck: tests.out
	@valgrind $(VFLAGS) ./tests.out
	@echo "Memory check passed"

clean:
	rm -rf *.o *.out *.out.dSYM

tests.out: test/test_isogram.c src/isogram.c src/isogram.h
	@echo Compiling $@
	@$(CC) $(CFLAGS) src/isogram.c test/vendor/unity.c test/test_isogram.c -o tests.out
run:
	@echo running main in isogram
	@$(CC) $(CFLAGS) src/isogram.c -o run_main.out
	@./run_main.out
