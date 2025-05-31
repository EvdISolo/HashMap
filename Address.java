import java.util.Objects;

    public class Address {
        protected String city;
        protected String country;


        public Address(String city, String country) {
            this.city = city;
            this.country = country;
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, country);
        }

        @Override
        public boolean equals(Object obj) {
            Address o = (Address) obj;
            return country.equals(o.country) && city.equals(o.city);
        }
    }

