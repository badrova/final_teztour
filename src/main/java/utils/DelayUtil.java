package utils;

public final class DelayUtil {

    private DelayUtil() {
    }

    public static void delay(long secondsToWaitMax, DelayCondition delayCondition) {
        long secondsToWait = 0;

        while (!delayCondition.completed()) {
            if (secondsToWait > secondsToWaitMax) {
                throw new io.cucumber.java.PendingException();
            }
            try {
                Thread.sleep(Constants.ONE_SECOND);
            } catch (InterruptedException exception) {
                Logger.error(exception.toString());
            }
            secondsToWait++;
        }
    }

    public static void delay(long milliSecondsToWait) {
        try {
            Thread.sleep(milliSecondsToWait);
        } catch (InterruptedException exception) {
            Logger.error(exception.toString());
        }
    }
}
