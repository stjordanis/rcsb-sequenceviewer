/*
 *                    BioJava development code
 *
 * This code may be freely distributed and modified under the
 * terms of the GNU Lesser General Public Licence.  This should
 * be distributed with the code.  If you do not have a copy,
 * see:
 *
 *      http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright for this code is held jointly by the individual
 * authors.  These should be listed in @author doc comments.
 *
 * For more information on the BioJava project and its aims,
 * or to join the biojava-l mailing list, visit the home page
 * at:
 *
 *      http://www.biojava.org/
 *
 * Created on Aug 9, 2010
 * Author: Jianjiong Gao 
 *
 */

package org.rcsb.sequence.ptm;

import org.biojava3.protmod.structure.ModifiedCompound;

import org.rcsb.sequence.model.AnnotationGroup;
import org.rcsb.sequence.model.AnnotationValue;

import org.rcsb.sequence.view.html.AnnotationSummaryCell;
import org.rcsb.sequence.view.html.HtmlElement;


public class ModResSummary  extends AnnotationSummaryCell<ModifiedCompound> {
   
   public ModResSummary(AnnotationGroup<ModifiedCompound> ag) {
      super(ag);
   }

   @Override
   protected void renderAnnotation(AnnotationValue<ModifiedCompound> av, HtmlElement el) {
	   PTMValue pv = (PTMValue)av;
	   ModifiedCompound mc = pv.value();
	   el.replaceContent(mc.toString());
   }
}
