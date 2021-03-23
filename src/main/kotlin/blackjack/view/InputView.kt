package blackjack.view

import blackjack.domain.Player

internal class InputView {

    fun getPlayerNames(): List<String> {
        println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)")
        return readLine()!!.split(DELIMITER).map { it.trim() }
    }

    fun getPlayerBetting(name: String): Int {
        println("\n${name}의 배팅 금액은?")
        return readLine()!!.toInt()
    }

    fun isHit(player: Player): Boolean {
        println("${player.name}는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)")
        return readLine()!! == "y"
    }

    companion object {
        private const val DELIMITER = ","
    }
}
