import java.util.concurrent.TimeUnit;

class TimeCode implements AutoCloseable {

    private long startTime;

    public TimeCode() {
        this.startTime = System.nanoTime();
    }

    @Override
    public void close() throws Exception {
        long endTime = System.nanoTime();
        System.out.printf("That took: %d ms%n",
                TimeUnit.NANOSECONDS.toMillis(endTime - this.startTime));
    }

}