/*
 * Copyright ©2018. Created by P. Bauer (p.bauer@htl-leonding.ac.at),
 * Department of Informatics and Media Technique, HTBLA Leonding,
 * Limesstr. 12 - 14, 4060 Leonding, AUSTRIA. All Rights Reserved. Permission
 * to use, copy, modify, and distribute this software and its documentation
 * for educational, research, and not-for-profit purposes, without fee and
 * without a signed licensing agreement, is hereby granted, provided that the
 * above copyright notice, this paragraph and the following two paragraphs
 * appear in all copies, modifications, and distributions. Contact the Head of
 * Informatics and Media Technique, HTBLA Leonding, Limesstr. 12 - 14,
 * 4060 Leonding, Austria, for commercial licensing opportunities.
 *
 * IN NO EVENT SHALL HTBLA LEONDING BE LIABLE TO ANY PARTY FOR DIRECT,
 * INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, INCLUDING LOST
 * PROFITS, ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION,
 * EVEN IF HTBLA LEONDING HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * HTBLA LEONDING SPECIFICALLY DISCLAIMS ANY WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE. THE SOFTWARE AND ACCOMPANYING DOCUMENTATION, IF ANY,
 * PROVIDED HEREUNDER IS PROVIDED "AS IS". HTBLA LEONDING HAS NO OBLIGATION
 * TO PROVIDE MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS, OR MODIFICATIONS.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HttpUrlChecker{
    public static void main(){
        int range = 100;
        List<Integer> primeNr = new ArrayList<>();
        boolean isPrime = false;

        for(int i = 0; i < range; i++){
            isPrime = false;
            if(i > 1 && i % 2 != 0){
                for(int j = 0; j < primeNr.size(); j++){
                    if(i % primeNr.get(j) == 0){
                        isPrime = true;
                    }
                }
                if(!isPrime){
                    primeNr.add(i);
                }
            }
        }
        for(int i =0; i < primeNr.size(); i++){
            System.out.print(primeNr.get(i));
        }
    }

    public static Matcher getMatcher(String httpString){
        String patternString = "^(http|https)://(www.)?([a-zA-Z0-9])*(.com|.jku.ac.at)$";

        Pattern pattern = Pattern.compile(patternString);

        Matcher matcher = pattern.matcher(httpString);

        return matcher;
    }
}
