package com.comparator.versionchecker.model;

public class SubVersionType implements Comparable<SubVersionType> {

    private final boolean isDigit;
    private final String subString;

    public SubVersionType(String subStr, boolean isDigit) {
        this.subString = subStr;
        this.isDigit = isDigit;
    }

    public boolean isDigit() {
        return isDigit;
    }

    public String getSubString() {
        return subString;
    }

    @Override
    public int compareTo(SubVersionType st) {
        if (this.isDigit && st.isDigit()) {
            return Integer.compare(Integer.parseInt(this.getSubString()), Integer.parseInt(st.getSubString()));
        }
        if (!this.isDigit && st.isDigit()) {
            return 1;
        }
        if (this.isDigit && !st.isDigit()) {
            return -1;
        }
        if (!this.isDigit && !st.isDigit()) {
            return this.subString.compareTo(st.getSubString());
        }

        return 0;
    }
}
