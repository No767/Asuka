package io.no767.Asuka;

public class JSONResponse {
    private int status;
    private int length;
    private Iterable<RinHelp> data;

    public JSONResponse(int status, int length, Iterable<RinHelp> data) {
        this.status = status;
        this.length = length;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public int getLength() {
        return length;
    }

    public Iterable<RinHelp> getData() {
        return data;
    }
}
