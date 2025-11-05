public class DoOp {
    public static String operate(String[] args) {
        if (args.length != 3)
            return "Error";

        int left = Integer.parseInt(args[0]);
        int right = Integer.parseInt(args[2]);

        try {
            return Integer.toString(applyOp(args[1], left, right));
        } catch (Error e) {
            System.out.println(left + args[1] + right);
            return "Error";
        }
    }

    static int applyOp(String op, int left, int right) {
        switch (op) {
            case "+":
                return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            case "%":
                return left % right;
            case "/":
                return left / right;

            default:
                throw new Error("unsupported operator: " + op);
        }
    }
}
