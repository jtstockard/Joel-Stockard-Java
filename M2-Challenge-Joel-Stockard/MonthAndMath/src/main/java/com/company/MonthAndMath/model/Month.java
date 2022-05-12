package com.company.MonthAndMath.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Objects;

public class Month {
    @NotEmpty(message = "You must supply a value for Number")
    @Size(min = 1, max = 12, message = "Month will be between 1 and 12")
        private int number;
        private String month;

        public Month(int number, String name) {
            this.number = number;
            this.month = name;
        }

        public Month() {
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Month month = (Month) o;
            return number == month.number && Objects.equals(month, month.month);
        }

        @Override
        public int hashCode() {
            return Objects.hash(number, month);
        }
}
