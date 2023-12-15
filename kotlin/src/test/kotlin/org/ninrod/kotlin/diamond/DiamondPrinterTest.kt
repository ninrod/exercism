package org.ninrod.kotlin.diamond

import org.amshove.kluent.`should be equal to`
import org.junit.jupiter.api.Test

class DiamondPrinterTest {

    @Test
    fun testOneByOneDiamond() {
        DiamondPrinter.printToList('A') `should be equal to` (listOf("A"))
    }

    @Test
    fun testTwoByTwoDiamond() {
        DiamondPrinter.printToList('B') `should be equal to`
                (listOf(
                        " A ",
                        "B B",
                        " A "
                ))
    }

    @Test
    fun testThreeByThreeDiamond() {
        DiamondPrinter.printToList('C') `should be equal to`
                (listOf(
                        "  A  ",
                        " B B ",
                        "C   C",
                        " B B ",
                        "  A  "))
    }

    @Test
    fun testFiveByFiveDiamond() {
        DiamondPrinter.printToList('E') `should be equal to`
                (listOf(
                        "    A    ",
                        "   B B   ",
                        "  C   C  ",
                        " D     D ",
                        "E       E",
                        " D     D ",
                        "  C   C  ",
                        "   B B   ",
                        "    A    "))
    }

    @Test
    fun testFullDiamond() {
        DiamondPrinter.printToList('Z') `should be equal to`
                (listOf(
                        "                         A                         ",
                        "                        B B                        ",
                        "                       C   C                       ",
                        "                      D     D                      ",
                        "                     E       E                     ",
                        "                    F         F                    ",
                        "                   G           G                   ",
                        "                  H             H                  ",
                        "                 I               I                 ",
                        "                J                 J                ",
                        "               K                   K               ",
                        "              L                     L              ",
                        "             M                       M             ",
                        "            N                         N            ",
                        "           O                           O           ",
                        "          P                             P          ",
                        "         Q                               Q         ",
                        "        R                                 R        ",
                        "       S                                   S       ",
                        "      T                                     T      ",
                        "     U                                       U     ",
                        "    V                                         V    ",
                        "   W                                           W   ",
                        "  X                                             X  ",
                        " Y                                               Y ",
                        "Z                                                 Z",
                        " Y                                               Y ",
                        "  X                                             X  ",
                        "   W                                           W   ",
                        "    V                                         V    ",
                        "     U                                       U     ",
                        "      T                                     T      ",
                        "       S                                   S       ",
                        "        R                                 R        ",
                        "         Q                               Q         ",
                        "          P                             P          ",
                        "           O                           O           ",
                        "            N                         N            ",
                        "             M                       M             ",
                        "              L                     L              ",
                        "               K                   K               ",
                        "                J                 J                ",
                        "                 I               I                 ",
                        "                  H             H                  ",
                        "                   G           G                   ",
                        "                    F         F                    ",
                        "                     E       E                     ",
                        "                      D     D                      ",
                        "                       C   C                       ",
                        "                        B B                        ",
                        "                         A                         "))
    }
}
