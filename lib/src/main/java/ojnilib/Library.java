package ojnilib;

import io.opentelemetry.proto.trace.v1.TracesData;

public class Library {
    private static final char[] HEX_ARRAY = "0123456789ABCDEF".toCharArray();
    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HEX_ARRAY[v >>> 4];
            hexChars[j * 2 + 1] = HEX_ARRAY[v & 0x0F];
        }
        return new String(hexChars);
    }
        public static byte[] processLogs(byte[] logdata)
    {
        System.out.println("JAVA: processLogs()");
        return logdata;
    }

    public static byte[] processMetrics(byte[] mtdata)
    {
        System.out.println("JAVA: processMetrics()");
        return mtdata;
    }

    public static byte[] processTraces(byte[] trdata)
    {
        System.out.printf("\n\nJAVA: processTraces() incoming %s\n\n", bytesToHex(trdata));
        try {
            io.opentelemetry.proto.trace.v1.TracesData data = io.opentelemetry.proto.trace.v1.TracesData.parseFrom(trdata);
            //byte[] dataout = data.toBuilder().getResourceSpansBuilder(0).getScopeSpansBuilder(0).getScopeBuilder().setName("manual-test-modified-in-java").build().toByteArray();
            io.opentelemetry.proto.trace.v1.TracesData.Builder builder = data.toBuilder();
            builder.getResourceSpansBuilder(0).getScopeSpansBuilder(0).getScopeBuilder().setName("manual-test-modified-in-java");
            byte[] dataout = builder.build().toByteArray();
            System.out.printf("\n\nJAVA: processTraces() outgoing %s\n\n", bytesToHex(dataout));
            return dataout;
          }
          catch(Exception e) {
          }

        System.out.println("JAVA: processTraces() oops shouldn't be here");
        return trdata;
    }
    public boolean testSomeday()
    {
        return true;
    }
}