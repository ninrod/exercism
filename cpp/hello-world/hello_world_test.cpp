#include "hello_world.cpp"
#define BOOST_TEST_MAIN
#include <boost/test/unit_test.hpp>

BOOST_AUTO_TEST_CASE(test_hello)
{
    BOOST_REQUIRE_EQUAL("Hello, World!", hello_world::hello());
}
