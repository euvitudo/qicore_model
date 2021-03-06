package org.cqf.qicore.dstu3;

import org.hl7.fhir.dstu3.model.Ratio;
import java.util.List;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.dstu3.model.BooleanType;
import org.hl7.fhir.dstu3.model.Range;
import org.hl7.fhir.dstu3.model.SimpleQuantity;
import org.hl7.fhir.dstu3.model.StringType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.Duration;
import org.hl7.fhir.dstu3.model.Timing;
import org.hl7.fhir.dstu3.model.BodySite;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Quantity;
import org.hl7.fhir.dstu3.model.*;

public class qicoremedicationdispenseDosageInstructionAdapter
{

   private DosageInstruction adaptedClass;

   public qicoremedicationdispenseDosageInstructionAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.DosageInstruction();
   }

   public qicoremedicationdispenseDosageInstructionAdapter(
		   DosageInstruction adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public DosageInstruction getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(
		   DosageInstruction param)
   {
      this.adaptedClass = param;
   }

   public Ratio getRateIncrement()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-rateIncrement");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.Ratio) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for rateIncrement");
      }
   }

   public qicoremedicationdispenseDosageInstructionAdapter setRateIncrement(
         Ratio param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-rateIncrement")
            .setValue(param);
      return this;
   }

   public Ratio getMaxDosePerPeriod()
   {
      try
      {
         return adaptedClass.getMaxDosePerPeriod();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting MaxDosePerPeriod", e);
      }
   }

   public qicoremedicationdispenseDosageInstructionAdapter setMaxDosePerPeriod(
         Ratio param)
   {
      adaptedClass.setMaxDosePerPeriod(param);
      return this;
   }

   public boolean hasMaxDosePerPeriod()
   {
      return adaptedClass.hasMaxDosePerPeriod();
   }

   public CodeableConcept getRoute()
   {
      try
      {
         return adaptedClass.getRoute();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Route", e);
      }
   }

   public qicoremedicationdispenseDosageInstructionAdapter setRoute(
         CodeableConcept param)
   {
      adaptedClass.setRoute(param);
      return this;
   }

   public boolean hasRoute()
   {
      return adaptedClass.hasRoute();
   }

   public CodeableConcept getMethod()
   {
      try
      {
         return adaptedClass.getMethod();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Method", e);
      }
   }

   public qicoremedicationdispenseDosageInstructionAdapter setMethod(
         CodeableConcept param)
   {
      adaptedClass.setMethod(param);
      return this;
   }

   public boolean hasMethod()
   {
      return adaptedClass.hasMethod();
   }

   public Type getAsNeeded()
   {
      try
      {
         return adaptedClass.getAsNeeded();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting AsNeeded", e);
      }
   }

   public qicoremedicationdispenseDosageInstructionAdapter setAsNeeded(
         Type param)
   {
      adaptedClass.setAsNeeded(param);
      return this;
   }

   public BooleanType getAsNeededBooleanType()
   {
      try
      {
         return adaptedClass.getAsNeededBooleanType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting AsNeededBooleanType", e);
      }
   }

   public boolean hasAsNeededBooleanType()
   {
      return adaptedClass.hasAsNeededBooleanType();
   }

   public CodeableConcept getAsNeededCodeableConcept()
   {
      try
      {
         return adaptedClass.getAsNeededCodeableConcept();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting AsNeededCodeableConcept",
               e);
      }
   }

   public boolean hasAsNeededCodeableConcept()
   {
      return adaptedClass.hasAsNeededCodeableConcept();
   }

   public Type getDose()
   {
      try
      {
         return adaptedClass.getDose();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Dose", e);
      }
   }

   public qicoremedicationdispenseDosageInstructionAdapter setDose(Type param)
   {
      adaptedClass.setDose(param);
      return this;
   }

   public Range getDoseRange()
   {
      try
      {
         return adaptedClass.getDoseRange();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting DoseRange", e);
      }
   }

   public boolean hasDoseRange()
   {
      return adaptedClass.hasDoseRange();
   }

   public SimpleQuantity getDoseSimpleQuantity()
   {
      try
      {
         return adaptedClass.getDoseSimpleQuantity();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting DoseSimpleQuantity", e);
      }
   }

   public boolean hasDoseSimpleQuantity()
   {
      return adaptedClass.hasDoseSimpleQuantity();
   }

   public boolean hasId()
   {
      return adaptedClass.hasId();
   }

   public boolean hasIdElement()
   {
      return adaptedClass.hasIdElement();
   }

   public StringType getIdElement()
   {
      try
      {
         return adaptedClass.getIdElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting IdElement", e);
      }
   }

   public String getId()
   {
      try
      {
         return adaptedClass.getId();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Id", e);
      }
   }

   public qicoremedicationdispenseDosageInstructionAdapter setIdElement(
         StringType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public qicoremedicationdispenseDosageInstructionAdapter setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public Duration getInfuseOver()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-infuseOver");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.Duration) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for infuseOver");
      }
   }

   public qicoremedicationdispenseDosageInstructionAdapter setInfuseOver(
         Duration param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-infuseOver")
            .setValue(param);
      return this;
   }

//   public Timing getTiming()
//   {
//      try
//      {
//         return adaptedClass.getTiming();
//      }
//      catch (Exception e)
//      {
//         throw new RuntimeException("Error getting Timing", e);
//      }
//   }

//   public qicoremedicationdispenseDosageInstructionAdapter setTiming(
//         Timing param)
//   {
//      adaptedClass.setTiming(param);
//      return this;
//   }

//   public boolean hasTiming()
//   {
//      return adaptedClass.hasTiming();
//   }

//   public Type getSite()
//   {
//      try
//      {
//         return adaptedClass.getSite();
//      }
//      catch (Exception e)
//      {
//         throw new RuntimeException("Error getting Site", e);
//      }
//   }

//   public qicoremedicationdispenseDosageInstructionAdapter setSite(Type param)
//   {
//      adaptedClass.setSite(param);
//      return this;
//   }

//   public CodeableConcept getSiteCodeableConcept()
//   {
//      try
//      {
//         return adaptedClass.getSiteCodeableConcept();
//      }
//      catch (Exception e)
//      {
//         throw new RuntimeException("Error getting SiteCodeableConcept", e);
//      }
//   }

//   public boolean hasSiteCodeableConcept()
//   {
//      return adaptedClass.hasSiteCodeableConcept();
//   }

//   public boolean hasSite()
//   {
//      return adaptedClass.hasSite();
//   }
//
//   public Reference getSiteReference()
//   {
//      try
//      {
//         return adaptedClass.getSiteReference();
//      }
//      catch (Exception e)
//      {
//         throw new RuntimeException("Error getting SiteReference", e);
//      }
//   }

//   public BodySite getSiteTarget()
//   {
//      return (org.hl7.fhir.dstu3.model.BodySite) ((org.hl7.fhir.dstu3.model.Reference) adaptedClass
//            .getSite()).getResource();
//   }
//
//   public qicoremedicationdispenseDosageInstructionAdapter setSite(
//         Reference param)
//   {
//      adaptedClass.setSite(param);
//      return this;
//   }

//   public qicoremedicationdispenseDosageInstructionAdapter setSiteTarget(
//         BodySite param)
//   {
//      Reference reference = new Reference(param);
//      adaptedClass.setSite(reference);
//      return this;
//   }

   public Ratio getRateGoal()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-rateGoal");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.Ratio) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for rateGoal");
      }
   }

   public qicoremedicationdispenseDosageInstructionAdapter setRateGoal(
         Ratio param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-rateGoal")
            .setValue(param);
      return this;
   }

   public Ratio getMinDosePerPeriod()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-minDosePerPeriod");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.Ratio) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for minDosePerPeriod");
      }
   }

   public qicoremedicationdispenseDosageInstructionAdapter setMinDosePerPeriod(
         Ratio param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-minDosePerPeriod")
            .setValue(param);
      return this;
   }

   public CodeableConcept getDoseType()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-doseType");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.CodeableConcept) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for doseType");
      }
   }

   public qicoremedicationdispenseDosageInstructionAdapter setDoseType(
         CodeableConcept param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-doseType")
            .setValue(param);
      return this;
   }

//   public Type getRate()
//   {
//      try
//      {
//         return adaptedClass.getRate();
//      }
//      catch (Exception e)
//      {
//         throw new RuntimeException("Error getting Rate", e);
//      }
//   }

//   public qicoremedicationdispenseDosageInstructionAdapter setRate(Type param)
//   {
//      adaptedClass.setRate(param);
//      return this;
//   }
//
//   public Ratio getRateRatio()
//   {
//      try
//      {
//         return adaptedClass.getRateRatio();
//      }
//      catch (Exception e)
//      {
//         throw new RuntimeException("Error getting RateRatio", e);
//      }
//   }

//   public boolean hasRateRatio()
//   {
//      return adaptedClass.hasRateRatio();
//   }
//
//   public Range getRateRange()
//   {
//      try
//      {
//         return adaptedClass.getRateRange();
//      }
//      catch (Exception e)
//      {
//         throw new RuntimeException("Error getting RateRange", e);
//      }
//   }

//   public boolean hasRateRange()
//   {
//      return adaptedClass.hasRateRange();
//   }
//
//   public SimpleQuantity getRateSimpleQuantity()
//   {
//      try
//      {
//         return adaptedClass.getRateSimpleQuantity();
//      }
//      catch (Exception e)
//      {
//         throw new RuntimeException("Error getting RateSimpleQuantity", e);
//      }
//   }

//   public boolean hasRateSimpleQuantity()
//   {
//      return adaptedClass.hasRateSimpleQuantity();
//   }

   public Duration getRateIncrementInterval()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-rateIncrementInterval");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.Duration) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for rateIncrementInterval");
      }
   }

   public qicoremedicationdispenseDosageInstructionAdapter setRateIncrementInterval(
         Duration param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-rateIncrementInterval")
            .setValue(param);
      return this;
   }

//   public List<CodeableConcept> getAdditionalInstructions()
//   {
//      try
//      {
//         return adaptedClass.getAdditionalInstructions();
//      }
//      catch (Exception e)
//      {
//         throw new RuntimeException("Error getting AdditionalInstructions",
//               e);
//      }
//   }

//   public qicoremedicationdispenseDosageInstructionAdapter setAdditionalInstructions(
//         List<CodeableConcept> param)
//   {
//      adaptedClass.setAdditionalInstructions(param);
//      return this;
//   }
//
//   public boolean hasAdditionalInstructions()
//   {
//      return adaptedClass.hasAdditionalInstructions();
//   }

//   public qicoremedicationdispenseDosageInstructionAdapter addAdditionalInstructions(
//         CodeableConcept param)
//   {
//      adaptedClass.addAdditionalInstructions(param);
//      return this;
//   }
//
//   public CodeableConcept addAdditionalInstructions()
//   {
//      return adaptedClass.addAdditionalInstructions();
//   }

   public Quantity getMaxDeliveryVolume()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-maxDeliveryVolume");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.Quantity) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for maxDeliveryVolume");
      }
   }

   public qicoremedicationdispenseDosageInstructionAdapter setMaxDeliveryVolume(
         Quantity param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-maxDeliveryVolume")
            .setValue(param);
      return this;
   }

   public Ratio getMaxDeliveryRate()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-maxDeliveryRate");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.Ratio) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for maxDeliveryRate");
      }
   }

   public qicoremedicationdispenseDosageInstructionAdapter setMaxDeliveryRate(
         Ratio param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/pharmacy-core-maxDeliveryRate")
            .setValue(param);
      return this;
   }

//   public boolean hasText()
//   {
//      return adaptedClass.hasText();
//   }
//
//   public boolean hasTextElement()
//   {
//      return adaptedClass.hasTextElement();
//   }

//   public StringType getTextElement()
//   {
//      try
//      {
//         return adaptedClass.getTextElement();
//      }
//      catch (Exception e)
//      {
//         throw new RuntimeException("Error getting TextElement", e);
//      }
//   }

//   public String getText()
//   {
//      try
//      {
//         return adaptedClass.getText();
//      }
//      catch (Exception e)
//      {
//         throw new RuntimeException("Error getting Text", e);
//      }
//   }

//   public qicoremedicationdispenseDosageInstructionAdapter setTextElement(
//         StringType param)
//   {
//      adaptedClass.setTextElement(param);
//      return this;
//   }

//   public qicoremedicationdispenseDosageInstructionAdapter setText(String param)
//   {
//      adaptedClass.setText(param);
//      return this;
//   }
}