public class Chifoumi {
    public static ChifoumiAction getActionBeatenBy(ChifoumiAction chifoumiAction) {
         switch (chifoumiAction) {
            case PAPER:
            return ChifoumiAction.ROCK;
                case  ROCK:
                return ChifoumiAction.SCISSOR;
                case SCISSOR:
                return ChifoumiAction.PAPER;
        }

        throw new Error("unreachable");
    }
}
