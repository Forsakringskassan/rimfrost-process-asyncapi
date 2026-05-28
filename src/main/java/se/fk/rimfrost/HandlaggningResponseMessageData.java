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
public class HandlaggningResponseMessageData implements Serializable
{
   private static final long serialVersionUID = 1L;
   @JsonProperty("handlaggningId")
   private String handlaggningId;
   @JsonProperty("resultat")
   private String resultat;
   @JsonProperty("error")
   @JsonInclude(Include.NON_NULL)
   private HandlaggningErrorInformation error;
   @JsonAnySetter
   @JsonInclude(Include.NON_NULL)
   private HashMap<String, Object> additionalProperties;

   public HandlaggningResponseMessageData()
   {
   }

   public String getHandlaggningId()
   {
      return this.handlaggningId;
   }

   public void setHandlaggningId(String handlaggningId)
   {
      this.handlaggningId = handlaggningId;
   }

   public String getResultat()
   {
      return this.resultat;
   }

   public void setResultat(String resultat)
   {
      this.resultat = resultat;
   }

   public HandlaggningErrorInformation getError()
   {
      return this.error;
   }

   public void setError(HandlaggningErrorInformation error)
   {
      this.error = error;
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
         HandlaggningResponseMessageData self = (HandlaggningResponseMessageData) o;
         return Objects.equals(this.handlaggningId, self.handlaggningId) && Objects.equals(this.resultat, self.resultat)
               && Objects.equals(this.error, self.error) && Objects.equals(this.additionalProperties, self.additionalProperties);
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
            this.handlaggningId, this.resultat, this.error, this.additionalProperties
      });
   }

   public String toString()
   {
      String var10000 = this.toIndentedString(this.handlaggningId);
      return "class HandlaggningResponseMessageData {\n    handlaggningId: " + var10000 + "\n    resultat: "
            + this.toIndentedString(this.resultat) + "\n    error: " + this.toIndentedString(this.error)
            + "\n    additionalProperties: " + this.toIndentedString(this.additionalProperties) + "\n}";
   }

   private String toIndentedString(Object o)
   {
      return o == null ? "null" : o.toString().replace("\n", "\n    ");
   }
}
