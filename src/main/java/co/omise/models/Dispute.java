package co.omise.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents Omise Dispute object.
 *
 * @see <a href="https://www.omise.co/disputes-api">Disputes API</a>
 */
public class Dispute extends Model {
    private long amount;
    private String currency;
    private DisputeStatus status;
    private String message;
    private String charge;

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public DisputeStatus getStatus() {
        return status;
    }

    public void setStatus(DisputeStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public static class Update extends Params {
        @JsonProperty
        private String message;

        public Update message(String message) {
            this.message = message;
            return this;
        }
    }
}
