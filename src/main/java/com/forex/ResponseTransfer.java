package com.forex;

/**
 * The type Response transfer.
 *
 * @author Cyrax class used to transporm simple message to view
 */
public class ResponseTransfer {

    private String responseText;

    /**
     * Instantiates a new Response transfer.
     */
    public ResponseTransfer() {
    }

    /**
     * Instantiates a new Response transfer.
     *
     * @param responseText the response text
     */
    public ResponseTransfer(String responseText) {
        this.responseText = responseText;
    }

    /**
     * Gets response text.
     *
     * @return the response text
     */
    public String getResponseText() {
        return responseText;
    }

    /**
     * Sets response text.
     *
     * @param responseText the response text
     */
    public void setResponseText(String responseText) {
        this.responseText = responseText;
    }
}
