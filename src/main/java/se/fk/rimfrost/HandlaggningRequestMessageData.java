package se.fk.rimfrost;

import java.io.Serializable;
import java.util.HashMap;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Objects;

@SuppressFBWarnings("EI_EXPOSE_REP")
public class HandlaggningRequestMessageData implements Serializable
{
   private static final long serialVersionUID = 1L;
   @JsonProperty(required = true)
   private String handlaggningId;
   @JsonAnySetter
   @JsonInclude(Include.NON_NULL)
   private HashMap<String, Object> additionalProperties;

   public HandlaggningRequestMessageData()
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
         HandlaggningRequestMessageData self = (HandlaggningRequestMessageData) o;
         return Objects.equals(this.handlaggningId, self.handlaggningId)
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
            this.handlaggningId, this.additionalProperties
      });
   }

   public String toString()
   {
      return "class HandlaggningRequestMessageData {\n    handlaggningId: " + this.toIndentedString(this.handlaggningId)
            + "\n    additionalProperties: "
            + this.toIndentedString(this.additionalProperties) + "\n}";
   }

   private String toIndentedString(Object o)
   {
      return o == null ? "null" : o.toString().replace("\n", "\n    ");
   }
}
