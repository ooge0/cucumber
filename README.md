# Cucumber / UI tests

Project contains finished test scenario based on Gherkin language for
checking functionality of web sites

google feature folder
1. googleSearch.feature contains simple scenario for searching info using Google search page

ooge0 feature folder
1. userValidation.feature contains simple scenario for filling forms according to presented
    information as simple data and using Data table approach
2. calculation.feature contains simple validation of result based on the
    web page behavior and reaction
google feature folder
ss.lv
1.Check SS.COM website functionality

All scenarios are are using Page Object model.
All scenarios are expected to use separated step definition files.

VM configuration is expected to use key value for extracting direct link to the web site
from env.config file.

Default key for tested web site are:
ss.lv       -DurlConfig=SS
google.com  -DurlConfig=GOOGLE
ooGe0       -DurlConfig=OOGE0

EXTRA:
use -Dcucumber.options="--tags @####" , where ### tagName for expected test

                                 `. ___
                                __,' __`.                _..----....____
                    __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'
              _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'
            ,'________________                          \`-._`-','
             `._              ```````````------...___   '-.._'-:
                ```--.._      ,.                     ````--...__\-.
                        `.--. `-`                       ____    |  |`
                          `. `.                       ,'`````.  ;  ;`
                            `._`.        __________   `.      \'__/`
                               `-:._____/______/___/____`.     \  `
                                           |       `._    `.    \
                                           `._________`-.   `.   `.___
                                                         SSt  `------'`


