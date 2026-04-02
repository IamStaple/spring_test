package spring_test.core.utils;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class ResponseDataMessage<T> implements Serializable {
    
    private int code;
    private String message;
    private T data;

    public ResponseDataMessage() {}

    public ResponseDataMessage(Builder<T> builder) 
    {
        this.code = builder.code;
        this.message = builder.message;
        this.data = builder.data;
    }

    public static <T> Builder<T> builder() 
    {
        return new Builder<>();
    }

    public static class Builder<T> {
        
        private int code;
        private String message;
        private T data;

        public Builder<T> code(int code) 
        {
            this.code = code;
            return this;
        }

        public Builder<T> message(String message) 
        {
            this.message = message;
            return this;
        }

        public Builder<T> data(T data) 
        {
            this.data = data;
            return this;
        }

        public ResponseDataMessage<T> build() 
        {
            return new ResponseDataMessage<T>(this);
        }
    }

    public int getCode() 
    {
        return this.code;
    }

    public String getMessage() 
    {
        return this.message;
    }

    public T getData() {
        return this.data;
    }
}
