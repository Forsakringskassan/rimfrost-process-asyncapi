package se.fk.rimfrost;

import java.io.Serializable;
import java.util.HashMap;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Map;
import java.util.Objects;

@SuppressFBWarnings("EI_EXPOSE_REP")
public class HandlaggningErrorInformation implements Serializable
{
   private static final long serialVersionUID = 1L;

   @JsonProperty("felkod")
   private String felkod;
   @JsonProperty("felmeddelande")
   private String felmeddelande;
   @JsonAnySetter
   @JsonInclude(Include.NON_NULL)
   private HashMap<String, Object> additionalProperties;

   public HandlaggningErrorInformation()
   {
   }

   public String getFelkod()
   {
      return this.felkod;
   }

   public void setFelkod(String felkod)
   {
      this.felkod = felkod;
   }

   public String getFelmeddelande()
   {
      return this.felmeddelande;
   }

   public void setFelmeddelande(String felmeddelande)
   {
      this.felmeddelande = felmeddelande;
   }

   @JsonAnyGetter
   public HashMap<String, Object> getAdditionalProperties()
   {
      return this.additionalProperties;
   }

   public void setAdditionalProperties(HashMap<String, Object> additionalProperties)
   {
      this.additionalProperties = additionalProperties;
   }

   public boolean equals(Object o)
   {
      if (this == o)
      {
         return true;
      }
      else if (o != null && this.getClass() == o.getClass())
      {
         HandlaggningErrorInformation self = (HandlaggningErrorInformation) o;
         return Objects.equals(this.felkod, self.felkod) && Objects.equals(this.felmeddelande, self.felmeddelande)
               && Objects.equals(this.additionalProperties, self.additionalProperties);
      }
      else
      {
         return false;
      }
   }

   public int hashCode()
   {
      return Objects.hash(new Object[]
      {
            this.felkod, this.felmeddelande, this.additionalProperties
      });
   }

   public String toString()
   {
      String var10000 = this.toIndentedString(this.felkod);
      return "class HandlaggningErrorInformation {\n    felkod: " + var10000 + "\n    felmeddelande: "
            + this.toIndentedString(this.felmeddelande) + "\n    additionalProperties: "
            + this.toIndentedString(this.additionalProperties) + "\n}";
   }

   private String toIndentedString(Object o)
   {
      return o == null ? "null" : o.toString().replace("\n", "\n    ");
   }
}
