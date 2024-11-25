package org.example.type;

import org.example.exception.TextLimitException;

import java.util.Objects;

public class StringText {
    private String text;
    private Integer limit;

    public StringText(String text, Integer limit) {
        this.text = text;
        this.limit = limit;
    }

    public String getText() {
        this.check();
        return text;
    }

    private void check() {
        if (Objects.isNull(this.limit)) {
            return;
        }
        int length = this.text.length();
        if (length > this.limit) {
            throw new TextLimitException(String.format("字符长度超长，期望：%s, 实际：%s", this.limit, length));
        }
    }
}
