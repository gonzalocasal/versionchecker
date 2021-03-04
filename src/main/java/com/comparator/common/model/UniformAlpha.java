package com.comparator.common.model;

import lombok.Getter;

@Getter
public class UniformAlpha implements Comparable<UniformAlpha> {

    private final String uniformAlpha;
    private final boolean isDigit;

    public UniformAlpha(String uniformAlpha) {
        this.uniformAlpha = uniformAlpha;
        this.isDigit = Character.isDigit(uniformAlpha.charAt(0));
    }

    @Override
    public int compareTo(UniformAlpha st) {
        if (this.isDigit && st.isDigit()) {
            return Integer.compare(Integer.parseInt(this.getUniformAlpha()), Integer.parseInt(st.getUniformAlpha()));
        }
        if (!this.isDigit && st.isDigit()) {
            return 1;
        }
        if (this.isDigit && !st.isDigit()) {
            return -1;
        }
        if (!this.isDigit && !st.isDigit()) {
            return this.uniformAlpha.compareTo(st.getUniformAlpha());
        }

        return 0;
    }
}