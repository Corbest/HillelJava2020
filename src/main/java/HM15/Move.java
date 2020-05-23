package HM15;

public enum Move {
    ONE,TWO,THREE;
    /**
     * Сравнивает текущий ход с переданным в параметре otherMove и определяет
     * победу, поражение или ничью.
     *
     * @param otherMove
     *            ход, с которым сравнивается текущий
     * @return 1 если текущий ход бьет другой, -1 если другой ход бьет текущий,
     *         0 в случае ничьей
     */
    public int compareMoves(Move otherMove) {
        // Ничья
        if (this == otherMove)
            return 0;

        return switch (this) {
            case ONE -> (otherMove == THREE ? 1 : -1);
            case TWO -> (otherMove == ONE ? 1 : -1);
            case THREE -> (otherMove == TWO ? 1 : -1);
        };
    }
}

